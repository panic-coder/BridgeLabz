var app = angular.module('angularApp',['ui.router','ngMaterial']);
app.config(function($stateProvider,$urlRouterProvider)
{
  $stateProvider
  .state('login',{
    url:'/login',
    templateUrl: 'templates/login.html',
    controller: 'loginCtr'
  })
  .state('home',{
    url:'/home',
    templateUrl: 'templates/home.html',
    controller: 'homeCtr'
  })
  .state('home.dashboard',{
    url:'/dashboard',
    templateUrl: 'templates/dashboard.html',
    controller: 'dashboardCtr'
  });
  $urlRouterProvider.otherwise('login');
});
