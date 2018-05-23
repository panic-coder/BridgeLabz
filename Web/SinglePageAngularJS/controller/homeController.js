app.controller('homeCtr', function($scope, $mdSidenav, readJsonData, $state) {
  $scope.consoleDisplay = function() {
    console.log($scope.user);
    console.log($scope.pass);
  }

  $scope.toggleLeft = buildToggler('left');

  function buildToggler(componentId) {
    return function() {
      $mdSidenav(componentId).toggle();
    }
  }

  $scope.getData = readJsonData.getJson();
  $scope.getData.then(function(response) {
    $scope.data = response;
    console.log($scope.data);
  })

$state.go('home.dashboard');

});
