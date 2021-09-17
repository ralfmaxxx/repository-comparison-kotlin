package repository.comparison.domain.repository

import repository.comparison.domain.repository.exception.CouldNotAddException
import java.util.UUID

interface RepositoryStatistics {
    @Throws(CouldNotAddException::class)
    fun add(repositoryStatistics: RepositoryStatistics)
    fun findOneBy(id: UUID): RepositoryStatistics?
}
