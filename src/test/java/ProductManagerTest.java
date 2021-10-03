import org.junit.jupiter.api.Test;
import ru.netology.Manager.ProductManager;
import ru.netology.domain.Book;
import ru.netology.domain.Product;

import static java.awt.SystemColor.text;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductManagerTest {
    ProductManager manager = new ProductManager();


    @Test public void ShouldBook() {
        Product product = new Book();

        Book first = new Book("Moi Dodir", 3, 123, "Chukovskii");
        Book second = new Book("Tarakaniche",2 , 187, "Chukovskii" );
        Book third = new Book("Doctor Aibolit", 1, 150, "Chukovskiy");


        manager.searchBy("Moi Dodir");
        manager.searchBy("Doctor Aibolit");

        Product[] actual = manager.searchBy();
        Product[] expected = new Book[] {first, third};

        assertArrayEquals(expected, actual);


    }
}
