(ns spec-tools.cljs-runner
  (:require [clojure.test :refer [run-tests]]
            spec-tools.core-test
            spec-tools.impl-test
            spec-tools.conform-test
            spec-tools.data-spec-test
            spec-tools.json-schema-test
            spec-tools.visitor-all-test
            spec-tools.visitor-test
            spec-tools.swagger.core-test
            spec-tools.swagger.spec-test))

(enable-console-print!)

(run-tests 'spec-tools.core-test
  'spec-tools.impl-test
  'spec-tools.conform-test
  'spec-tools.data-spec-test
  'spec-tools.json-schema-test
  'spec-tools.visitor-all-test
  'spec-tools.visitor-test
  'spec-tools.swagger.core-test
  'spec-tools.swagger.spec-test)
