package repository.comparison.domain.repository

import repository.comparison.domain.Comparison
import repository.comparison.domain.repository.exception.CouldNotAddException
import java.util.UUID

interface Comparisons {
    @Throws(CouldNotAddException::class)
    fun add(comparison: Comparison)
    fun findOneById(id: UUID)
}
