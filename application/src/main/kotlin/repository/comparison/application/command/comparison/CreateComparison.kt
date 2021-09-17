package repository.comparison.application.command.comparison

import java.util.UUID

class CreateComparison(
    val id: UUID,
    val firstRepositoryName: String,
    val secondRepositoryName: String
)
