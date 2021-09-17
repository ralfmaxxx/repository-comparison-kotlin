package repository.comparison.application.command.comparison

import repository.comparison.application.Transaction
import repository.comparison.application.command.Handler
import repository.comparison.domain.Comparison
import repository.comparison.domain.RepositoryStatistics

class CreateComparisonHandler(
    private val transaction: Transaction,
    private val comparison: Comparison,
    private val repositoryStatistics: RepositoryStatistics
): Handler {
    fun handle(createComparison: CreateComparison){
        this.transaction.begin()

        val firstRepositoryStatistics = RepositoryStatistics.Statistics(
            
        )
    }
}
