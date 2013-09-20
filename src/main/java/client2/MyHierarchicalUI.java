package client2;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

/**
 * @author Mikalai Kisel
 */
public class MyHierarchicalUI extends UI {
    @Override
    protected void init(VaadinRequest request) {
        // The root of the component hierarchy
        VerticalLayout content = new VerticalLayout();
        content.setSizeFull(); // Use entire window
        setContent(content);
        // Attach to the UI
        // Add some component
        content.addComponent(new Label("Hello!"));
        // Layout inside layout
        HorizontalLayout hor = new HorizontalLayout();
        hor.setSizeFull(); // Use all available space
        // Couple of horizontally laid out components
        Tree tree = new Tree("My Tree");
        hor.addComponent(tree);
        Table table = new Table("My Table");
        table.setSizeFull();
        hor.addComponent(table);
        hor.setExpandRatio(table, 1); // Expand to fill
        content.addComponent(hor);
        content.setExpandRatio(hor, 1); // Expand to fill
    }
}