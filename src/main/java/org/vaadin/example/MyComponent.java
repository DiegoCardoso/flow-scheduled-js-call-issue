package org.vaadin.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

@Tag("my-component")
@JsModule("my-component.js")
public class MyComponent extends Component {

  public void callClientFunction() {
    getElement().callJsFunction("clientFunction");
  }
}