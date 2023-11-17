package org.vaadin.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {
    public MainView() {
        var myVisibleComponent = new MyComponent();
        myVisibleComponent.callClientFunction();
        add(myVisibleComponent);
        
        var myComponent = new MyComponent();
        myComponent.setVisible(false);
        myComponent.callClientFunction();
        
        var horizontalLayout = new HorizontalLayout();
        horizontalLayout.add(
            myComponent, 
            new Button("detach/attach", e -> {
                myComponent.setVisible(true);
                horizontalLayout.remove(myComponent);
                horizontalLayout.addComponentAsFirst(myComponent);
            }), 
            new Button("set visible", e -> myComponent.setVisible(true)),
            new Button("detach componenent", e -> horizontalLayout.remove(myComponent)),
            new Button("attach component", e -> horizontalLayout.addComponentAsFirst(myComponent)));
        add(horizontalLayout);
    }

}
