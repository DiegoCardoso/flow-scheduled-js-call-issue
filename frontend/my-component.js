import { LitElement, html } from 'lit';

class MyComponent extends LitElement {
  static properties = {
    prop: { type: String },
  };

  constructor() {
    super();
    this.prop = 'initial value';
  }

  clientFunction() {
    this.prop = 'client function called';
  }

  render() {
    return html`<span id="span">${this.prop}</span>`;
  }
}

customElements.define('my-component', MyComponent);
