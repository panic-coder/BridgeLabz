app.controller('homeCtr', function($scope, $mdSidenav, readJsonData, $state, $mdDialog, $rootScope) {

  //$filter('currency')(amount, symbol, fractionSize)
  $state.go('home.dashboard');

  $scope.homePage = function(){
    $state.go('home.dashboard');
  }
  //$state.go('home');
  $scope.toggleLeft = buildToggler('left');
  function buildToggler(id) {
    return function() {
      if (id ==='left') {
        $mdSidenav(id).toggle();
        var isOpen=$mdSidenav(id).isOpen();
        if(isOpen)
        {
          document.getElementById("dashboardid").style.marginLeft = "25%";
          document.getElementById("hideSideBar").style.width = "25%";
        }
        else {
        document.getElementById("dashboardid").style.marginLeft = "0%";
      }
    }
  }
}
  $scope.logout = function(){
    $state.go('login');
  }

  $scope.fileData = function(){
    console.log($scope.display);
  }

  $scope.getData = readJsonData.getJson();
  $scope.getData.then(function(response) {
    $scope.data = response;
  })

  $scope.uniqueManufacturer = [];
  $scope.uniqueStorage = [];
  $scope.uniqueOS = [];
  $scope.uniqueCamera = [];
  $scope.favourite = [];

  $scope.selectingValues = function(id,value){
    switch(value){
      case 1 :
        adding($scope.uniqueManufacturer,id);
        break;
      case 2 :
        adding($scope.uniqueStorage,id);
        break;
      case 3 :
        adding($scope.uniqueOS,id);
        break;
      case 4 :
        adding($scope.uniqueCamera,id);
        break;
    }
  }

function adding(array,id){
  var index;
  index = array.indexOf(id);
  if(index>-1){
    array.splice(index,1);
  }
  else {
    array.push(id);
  }
}


//console.log($scope.quantity);

$scope.showFavorite = function(){
  $state.go('home.favourite');
  //console.log($rootScope.favouriteElements);
}
//console.log(showFavorite);
  $state.go('home.favourite');

$scope.numbers = [1,2,3,4,5];
//console.log($scope.quantity);

$scope.quantity=0;
$scope.presentPrice = 0;
$scope.p = [];

$scope.addingQuantity = function(s,f){

  //console.log($rootScope.favouriteElements);
  var a = $scope.p;
  var index;
// if ($scope.p.length != 0) {
//  for (var i = 0; i < $scope.p.length; i++)
var count = 0;
for (var i = 1; i <= 5; i++) {
  index = findingIndex({id:f.id,quantity:i});
  console.log(index);
  //console.log({id:f.id,quantity:i});
      if (index > -1) {
        a.splice(index,1);
        a.push({id:f.id,quantity:s})
        count++;
      }

//console.log(i);
}
if(count==0) {
  a.push({id:f.id,quantity:s});
}
$scope.p = a;
//}
//}
//  console.log($scope.p[0].quantity);
  var cartFile = $rootScope.favouriteElements;
  //console.log(cartFile);
  $scope.quantity = 0;
  for (var i = 0; i < $scope.p.length; i++) {
    for (var j = 0; j < cartFile.length; j++) {
      //console.log($scope.p[i].id,'id',cartFile[j].id);
      if ($scope.p[i].id == cartFile[j].id) {
          $scope.quantity = $scope.quantity + (($scope.p[i].quantity)*(cartFile[j].price));
      }
    }
  }
  $scope.presentPrice =  $scope.quantity ;
  //console.log(f.price);
  //console.log($scope.quantity);
  //console.log($scope.presentPrice);
  function findingIndex(o) {
      for (var i = 0; i < $scope.p.length; i++) {
          if ($scope.p[i].id == o.id && $scope.p[i].quantity == o.quantity) {
              return i;
          }
      }
      return -1;
  }
}

$scope.remove = function(file){
  var index = $rootScope.favouriteElements.indexOf(file);
  $rootScope.favouriteElements.splice(index,1);
  var e = $rootScope.favouriteElements;
  localStorage.removeItem('key');
  localStorage.setItem('key',JSON.stringify(e));
  var d = localStorage.getItem('key');
  console.log(d);
}

$scope.ad = function(num){
  //console.log(num);
}

// $scope.toggleLeft = buildToggler('hideSideBar');
//   function buildToggler(id) {
//     return function(){
//       var e = document.getElementById(id);
//       console.log(e.style.display);
//       if(e.style.display == 'none' || e.style.display == ''){
//         e.classList.remove("md-closed");
//         e.style.display = 'block';
//       }else{
//         e.classList.add("md-closed");
//         e.style.display = 'none';
//       }
//     }
//   }

});

  //$state.go('home.favourite');
