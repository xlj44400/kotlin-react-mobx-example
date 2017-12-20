if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'sample-library'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'sample-library'.");
}
this['sample-library'] = function (_, Kotlin) {
  'use strict';
  var $$importsForInline$$ = _.$$importsForInline$$ || (_.$$importsForInline$$ = {});
  var defineInlineFunction = Kotlin.defineInlineFunction;
  var wrapFunction = Kotlin.wrapFunction;
  function factorial(n) {
    return n === 0 ? Kotlin.Long.ONE : Kotlin.Long.fromInt(n).multiply(factorial(n - 1 | 0));
  }
  var forOdd = defineInlineFunction('sample-library.org.sample.forOdd_364jb5$', wrapFunction(function () {
    return function ($receiver, f) {
      var tmp$;
      tmp$ = $receiver.iterator();
      while (tmp$.hasNext()) {
        var element = tmp$.next();
        if (element % 2 === 1)
          f(element);
      }
    };
  }));
  var package$org = _.org || (_.org = {});
  var package$sample = package$org.sample || (package$org.sample = {});
  package$sample.factorial_za3lpa$ = factorial;
  $$importsForInline$$['sample-library'] = _;
  package$sample.forOdd_364jb5$ = forOdd;
  Kotlin.defineModule('sample-library', _);
  return _;
}(typeof this['sample-library'] === 'undefined' ? {} : this['sample-library'], kotlin);
