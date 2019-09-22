
public class Main {
	public static void main(String[] args) {
		// BookShelf の大きさを指定
		BookShelf bookShelf = new BookShelf();
		bookShelf.appendBook(new Book("「人間嫌い」のルール"));
		bookShelf.appendBook(new Book("孤独について"));
		bookShelf.appendBook(new Book("人生を〈半分〉降りる"));
		bookShelf.appendBook(new Book("今日の芸術"));
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
