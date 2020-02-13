data class Bookcase(val numberOfShelves: Int, val color: String) {
    private val shelves = ArrayList<Bookshelf>()

    fun addBookshelf(bookshelf: Bookshelf) {
        shelves.add(bookshelf)
    }

}

data class Bookshelf(val availableTypes: ArrayList<CoverType>, val size: Int) {
    private val books = ArrayList<Book>()

    fun addBook(book: Book) {
        if (book.coverType in availableTypes) {
            books.add(book)
        }
    }

}