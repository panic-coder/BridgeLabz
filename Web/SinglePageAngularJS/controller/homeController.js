app.controller('homeCtr', function($scope, $mdSidenav, readJsonData, $state, $mdDialog, $rootScope) {


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
$state.go('home.dashboard');

console.log($scope.quantity);

$scope.showFavorite = function(){
  $state.go('home.favourite');
  //console.log($rootScope.favouriteElements);
}
//console.log(showFavorite);
  $state.go('home.favourite');

$scope.states = [1,2,3,4,5];



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

  $state.go('home.favourite');
