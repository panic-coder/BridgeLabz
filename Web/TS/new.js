var Barista = /** @class */ (function () {
    function Barista() {
    }
    Barista.callOrder = function (name) {
        console.log('Peppermint ' + name);
    };
    return Barista;
}());
var customer = {
    name: 'Shubham'
};
Barista.callOrder(customer.name);
