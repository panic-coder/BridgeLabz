class Barista{
    static callOrder(name:string){
        console.log('Peppermint ' + name);
        
    }
}

let customers = {
    name: 'Shubham'
};

Barista.callOrder(customers.name)