package repository.comparison.application

interface Transaction {
    fun begin()
    fun commit()
    fun rollback()
}
