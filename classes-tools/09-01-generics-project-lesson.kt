@Composable
fun CountryCodeBottomSheet(
    selectedCodes: Set<CountryCode>,
    onCodesSelected: (Set<CountryCode>) -> Unit,
    onDismiss: () -> Unit
) {
    ModalBottomSheet(
        onDismissRequest = onDismiss,
        dragHandle = { BottomSheetDefaults.DragHandle() }
    ) {
        // основная реализация компонента
    }
 }
// ----

@Composable
fun MessengersBottomSheet(
    selectedApps: Set<MessagingApp>,
    onAppsSelected: (Set<MessagingApp>) -> Unit,
    onDismiss: () -> Unit
) {
    ModalBottomSheet(
        onDismissRequest = onDismiss,
        dragHandle = { BottomSheetDefaults.DragHandle() }
    ) {
        // основная реализация компонента
    }
}
// ----

@Composable
fun SortBottomSheet(
    currentSortOrder: SortOrder,
    onSortOrderSelected: (SortOrder) -> Unit,
    onDismiss: () -> Unit
) {
    CommonBottomSheet(
        title = stringResource(R.string.sort_by_default),
        items = SortOrder.entries,
        selectedItems = setOf(currentSortOrder),
        onItemsSelected = { selected ->
            selected.firstOrNull()?.let { onSortOrderSelected(it) }
        },
        onDismiss = onDismiss
    ) { sortOrder, isSelected ->
        SortOrderOption(
            isSelected = isSelected,
            sortOrder = sortOrder,
            onSortOrderSelected = onSortOrderSelected
        )
    }
}
// ----

@Composable
fun <T> CommonBottomSheet(
    title: String,
    items: List<T>,
    selectedItems: Set<T>,
    onItemsSelected: (Set<T>) -> Unit,
    onDismiss: () -> Unit,
    itemContent: @Composable (T, Boolean) -> Unit
) {
    ModalBottomSheet(
        onDismissRequest = onDismiss,
        dragHandle = { BottomSheetDefaults.DragHandle() }
    ) {
        // основная реализация компонента
    }
}
// ----

@Composable
fun CountryCodeBottomSheet(
    selectedCodes: Set<CountryCode>,
    onCodesSelected: (Set<CountryCode>) -> Unit,
    onDismiss: () -> Unit
) {
    CommonBottomSheet(
        title = stringResource(R.string.filter_by_country_code),
        items = CountryCode.COMMON_CODES,
        selectedItems = selectedCodes,
        onItemsSelected = onCodesSelected,
        onDismiss = onDismiss
    ) { countryCode, isSelected ->
        CountryCodeOption(
            isSelected = isSelected,
            countryCode = countryCode,
            selectedCodes = selectedCodes,
            onCodesSelected = onCodesSelected
        )
    }
}
// ----

@Composable
fun MessengersBottomSheet(
    selectedApps: Set<MessagingApp>,
    onAppsSelected: (Set<MessagingApp>) -> Unit,
    onDismiss: () -> Unit
) {
    CommonBottomSheet(
        title = stringResource(R.string.filter_by_messaging_app),
        items = MessagingApp.entries,
        selectedItems = selectedApps,
        onItemsSelected = onAppsSelected,
        onDismiss = onDismiss
    ) { app, isSelected ->
        MessengerOption(
            isSelected = isSelected,
            app = app,
            selectedApps = selectedApps,
            onAppsSelected = onAppsSelected
        )
    }
}
