package academy.digitallab.store.shopping.repositories;

import academy.digitallab.store.shopping.entities.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}