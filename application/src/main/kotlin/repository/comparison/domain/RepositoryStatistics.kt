package repository.comparison.domain

import java.util.*

class RepositoryStatistics constructor(
    val id: UUID,
    val username: String,
    val name: String
) {
    private val status: Status = Status.PENDING
    private var statistics: Statistics? = null

    private constructor(id: UUID, username:String, name: String, statistics: Statistics): this(id, username, name) {
        this.statistics = statistics
    }

    fun withStatistics(statistics: Statistics): RepositoryStatistics {
        return RepositoryStatistics(this.id, this.username, this.name, statistics)
    }

    enum class Status {
        PENDING, DELIVERED
    }

    class Statistics(
        private val forksCount: Int,
        private val starsCount: Int,
        private val watchersCount: Int,
        private val lastReleaseDate: Date?,
        private val openPRCount: Int,
        private val close: Int,
    )
}
