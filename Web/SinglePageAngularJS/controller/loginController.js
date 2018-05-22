app.controller('loginCtr', function($scope, $state) {
  // $scope.consoleDisplay = function(){
  //   console.log($scope.user);
  //   console.log($scope.pass);
  // }

  $scope.goToHomePage = function() {
    console.log($scope.user);
    console.log($scope.pass);
    $state.go('home');
  }

});
