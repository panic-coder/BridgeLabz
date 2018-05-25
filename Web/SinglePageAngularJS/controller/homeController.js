app.controller('homeCtr', function($scope, $mdSidenav, readJsonData, $state, $mdDialog) {
  $scope.consoleDisplay = function() {
    console.log($scope.user);
    console.log($scope.pass);
  }

  $scope.toggleLeft = buildToggler('left');

  function buildToggler(id) {
    return function() {
      $mdSidenav(id).toggle();
  }
}
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
    console.log($scope.data);
  })

$state.go('home.dashboard');

$scope.showAdvanced = function(ev) {
    $mdDialog.show({
      //controller: 'dialogCtr',
      //locals : {info : data},
      templateUrl: 'templates/popup.html',
      parent: angular.element(document.body),
      targetEvent: ev,
      clickOutsideToClose:true
    })}

    $scope.cancel = function() {
        $mdDialog.cancel();
    }

function dialogCtr($scope, $mdDialog, info) {
    // Assigned from construction <code>locals</code> options...
    $scope.info = info;
  }

});
// var e = document.getElementById(id);
// console.log(e.style.display);
// if(e.style.display == 'none' || e.style.display == ''){
//   e.classList.remove("md-closed");
//   e.style.display = 'block';
// }else{
//   e.classList.add("md-closed");
//   e.style.display = 'none';
// }
