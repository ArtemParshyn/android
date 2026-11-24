sealed class NetworkError(val message: String) {

    class ServerError(requestId: String, message: String?) :
        NetworkError("Ошибка взаимодействия с сервером для запроса: id = $requestId. Сообщение об ошибке: $message")

    class NoData(requestId: String) :
        NetworkError("Для запроса: id = $requestId нет данных")

    class NoInternet(val requestId: String) :
        NetworkError("Нет подключения к интернету.")
}

class ErrorHandler {

    fun handleError(error: NetworkError) {
        when (error) {
            is NetworkError.ServerError -> showErrorMessage(error.message)
            is NetworkError.NoData -> showEmptyContent()
            is NetworkError.NoInternet -> {
                showErrorMessage(error.message)
                reloadRequest(error.requestId)
            }
        }
    }

    private fun showErrorMessage(message: String) {
        println(message)
    }

    private fun showEmptyContent() {
        println("Показываем пустой экран")
    }

    private fun reloadRequest(requestId: String) {
        println("При появлении подключения к интернету перезапускаем запрос: id = $requestId")
    }
}

class Network {

    fun onNetworkError(code: Int?, requestId: String, error: String?): NetworkError {
        return when (code) {
            null -> NetworkError.NoInternet(requestId)
            200 -> NetworkError.NoData(requestId)
            else -> NetworkError.ServerError(requestId, error)
        }
    }
}
