object PlayingField {
    object Size {
        var width: Int = 0
            set(value) {
                field = maxOf(0, value)
            }
        var height: Int = 0
            set(value) {
                field = maxOf(0, value)
            }

        fun changeSize(width: Int, height: Int) {
            this.width = width
            this.height = height
        }
    }
}