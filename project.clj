(defproject uritemplate-clj "1.2.4"
  :description "Clojure implementation of URI Templates as specified in RFC 6570 (http://tools.ietf.org/html/rfc6570), level 4 compliant"
  :url "https://github.com/mwkuster/uritemplate-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :comment "Author: Marc Wilhelm Küster"}
  :dependencies [[org.clojure/clojure "1.10.2"]
                 [cheshire "5.10.0"]
                 [ring "1.9.0" :exclusions [org.clojure/clojure]]])
