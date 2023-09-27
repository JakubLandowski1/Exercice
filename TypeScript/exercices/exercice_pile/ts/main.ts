class Pile<T>{
    public tab: T[];
    public element : T;

    constructor(element:T ){
        this.element= element;
        this.tab = [];
    }

    empiler(param: T){
        this.tab.push(param)
    }

    depiler(param: T){
        this.tab = this.tab.filter((e) => param != e)
    }

}

const tab = new Pile("a")

tab.empiler("b")
tab.empiler("c")

tab.depiler("b")
console.log(tab)


