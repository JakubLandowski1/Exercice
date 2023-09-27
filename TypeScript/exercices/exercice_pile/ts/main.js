"use strict";
class Pile {
    constructor(element) {
        this.element = element;
        this.tab = [];
    }
    empiler(param) {
        this.tab.push(param);
    }
    depiler(param) {
        this.tab = this.tab.filter((e) => param != e);
    }
}
const tab = new Pile("a");
tab.empiler("b");
tab.empiler("c");
tab.depiler("b");
console.log(tab);
