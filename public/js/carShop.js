URL_SERVER = 'http://localhost:9000';


var carShop = angular.module("carShop", ['ngRoute', 'angularUtils.directives.dirPagination']);

carShop.config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider
            .when('/index', {
                templateUrl: './html/adverts.html',
                controller: 'IndexController'
            }).otherwise({
            templateUrl: './html/empty.html',
            controller: 'RouteController'
        });
    }
]);

carShop.controller('RouteController', function ($scope, $http, $location, $route, $routeParams) {
    $location.path("/index");
    $scope.login = function () {
        $location.path('/login');
    }

});

carShop.controller('IndexController', function ($scope, $http, $location, $route, $routeParams) {
    console.log("121212");
    $scope.loginIn = function () {
        $location.path('/login');
    }
});

// function loadHeader() {
//     $('#header').load('./html/header.html');
// }
//
// function LoadFooter() {
//     $('#footer').load('./html/footer.html');
// }
// function login() {
//     console.log("hello");
// }