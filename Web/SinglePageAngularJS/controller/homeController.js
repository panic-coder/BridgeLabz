app.controller('homeCtr', function($scope, $mdSidenav, readJsonData, $state, $mdDialog, $rootScope) {

  $scope.toggleLeft = buildToggler('left');
  function buildToggler(id) {
    return function() {
      //$mdSidenav(id).toggle();
      //$scope.t = 0;
      //console.log($mdSidenav(id));
      //console.log(document.getElementById("hideSideBar"));

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
        //document.getElementById("hideSideBar").style.width = "0%";
        //$scope.t=0;
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

  $scope.selectingValues = function(id,value){
    switch(value){
      case 1 :
        printManufacturer(id);
        break;
      case 2 :
        printStorage(id);
        break;
      case 3 :
        printOS(id);
        break;
      case 4 :
        printCamera(id);
        break;
    }
  }

function printManufacturer(id){
    adding($scope.uniqueManufacturer,id);
}

function printStorage(id){
    adding($scope.uniqueStorage,id);
}

function printOS(id){
    adding($scope.uniqueOS,id);
}

function printCamera(id){
    adding($scope.uniqueCamera,id);
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

$scope.showFavorite = function(){
  console.log($rootScope.favouriteElements);
  $state.go('home.dashboard');
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
