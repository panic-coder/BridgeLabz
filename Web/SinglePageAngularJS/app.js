var app = angular.module('angularApp',['ui.router','ngMaterial','ngMessages']);
app.config(function($stateProvider,$urlRouterProvider)
{
  $stateProvider
  .state('login',{
    url:'/login',
    templateUrl: 'templates/login.html',
    controller: 'DemoCtrl'
  });

  $urlRouterProvider.otherwise('/login');
});
