import java.time.LocalDate
import kotlin.collections.ArrayList

data class Book(val name: String, val authorName: Authors,
                val editorName: Editors, val translatorName: String = "",
                val publisherName: String, val publishingYear: LocalDate,
                val publicationTown: String, val countPages: Int,
                val publicationType: PublicationType, val coverType: CoverType,
                val ISBN: String
)

data class Authors(val names: ArrayList<String>)
data class Editors(val names: ArrayList<String>)

enum class PublicationType {
    fiction, popscience, journalism
}

enum class CoverType {
    softcover, hardcover, pocketbook, album
}