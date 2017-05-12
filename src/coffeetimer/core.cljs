(ns coffeetimer.core
  (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(println "This text is printed from src/coffeetimer/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Espresso2"}))

(defn timer []
  [:div {:class "timer-circle"}
      (let [d 380]
           [:svg {:width d
                  :height d}
               [:circle {:cx (/ d 2)
                         :cy (/ d 2)
                         :r (/ d 2)
                         :fill "none"
                         :stroke-width 0.5
                         :stroke "#745A3E"}]])])







(defn hello-world []
  [:div {:class "container-1"}

   [:div {:class "gradient container-2"}
    [:div {:class "container-3"}
      [:div {:class "inner-timer"}
        [:img {:src "images/espresso.svg"}]
        [:p {:class "big-time"} "06:23"]]
      [timer]]
    [:div {:class "button-last-cup"}
        [:img {:src "images/empty-cup.svg"}]
        [:p "last cup gone"]]
    [:div {:class "container-3"}
      [:div {:class "inner-timer"}
        [:img {:src "images/filtercoffee.svg"}]
        [:p {:class "big-time"} "10:00"]]
      [timer]
      [:div {:class "button-last-cup"}
        [:img {:src "images/empty-cup.svg"}]
        [:p "last cup gone"]]]]
   [:div {:class "footer"}
      [:div {:class "button-re-supply"}
        [:img {:src "images/cart.svg"}]
        [:p "re-supply"]]]])


(reagent/render-component [hello-world]
                          (. js/document (getElementById "app")))

(defn on-js-reload [])
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
