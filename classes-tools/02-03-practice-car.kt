class Car(val name: String) {
    constructor(brand: String, model: String) : this("$brand $model")
}
