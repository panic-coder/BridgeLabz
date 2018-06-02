app.controller('homeCtr', function($scope, $mdSidenav, readJsonData, $state, $mdDialog, $rootScope) {
  // $scope.consoleDisplay = function() {
  //   console.log($scope.user);
  //   console.log($scope.pass);
  // }

  $scope.toggleLeft = buildToggler('left');
  function buildToggler(id) {
    return function() {
      $mdSidenav(id).toggle();
    }
  }

  $scope.fileData = function(){
    console.log($scope.display);
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

// function buildToggler(componentId){
//   if (!hidden) {
//     jq('#hideme').addClass('hidden');
//   } else {
//     jq
//   }
//
// }
  $scope.getData = readJsonData.getJson();
  $scope.getData.then(function(response) {
    $scope.data = response;
    //console.log($scope.data);
  })

  $scope.uniqueManufacturer = [];
  $scope.uniqueStorage = [];
  $scope.uniqueOS = [];
  $scope.uniqueCamera = [];

  $scope.printManufacturer = function(id,data){
    var index;
    var value;
    var m = 'manufacturer';
    for (var i = 0; i < data.length; i++) {
      value = data[i].specs[m];

    index = $scope.uniqueManufacturer.indexOf(id);
    //console.log(index);
    if(index>-1){
      $scope.uniqueManufacturer.splice(index,1);
      break;
    }
    else {
      $scope.uniqueManufacturer.push(id);
      break;
    }
    //console.log(value);
  }
  //  console.log($scope.uniqueManufacturer);
}

$scope.printStorage = function(id,data){
  var index;
  var value;
  var m = 'storage';
  for (var i = 0; i < data.length; i++) {
    value = data[i].specs[m];

  index = $scope.uniqueStorage.indexOf(id);
  //console.log(index);
  if(index>-1){
    $scope.uniqueStorage.splice(index,1);
    break;
  }
  else {
    $scope.uniqueStorage.push(id);
    break;
  }
  //console.log(value);
}
  //console.log($scope.uniqueStorage);
}

$scope.printOS = function(id,data){
  var index;
  var value;
  var m = 'os';
  for (var i = 0; i < data.length; i++) {
    value = data[i].specs[m];

  index = $scope.uniqueOS.indexOf(id);
  //console.log(index);
  if(index>-1){
    $scope.uniqueOS.splice(index,1);
    break;
  }
  else {
    $scope.uniqueOS.push(id);
    break;
  }
  //console.log(value);
}
  //console.log($scope.uniqueOS);
}

$scope.printCamera = function(id,data){
  var index;
  var value;
  var m = 'camera';
  for (var i = 0; i < data.length; i++) {
    value = data[i].specs[m];

  index = $scope.uniqueCamera.indexOf(id);
  //console.log(index);
  if(index>-1){
    $scope.uniqueCamera.splice(index,1);
    break;
  }
  else {
    $scope.uniqueCamera.push(id);
    break;
  }
    //console.log(value);
}
  //console.log($scope.uniqueCamera);
}

  // $scope.exists = function(id){
  //   return uniqueManufacturer.indexOf(id) > -1;
  // }

$state.go('home.dashboard');

});
