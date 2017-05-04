(ns coffeetimer.core
  (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(println "This text is printed from src/coffeetimer/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Espresso2"}))

(defn timer []
  [:div {:style {:display :flex
                 :flex 1
                 :flex-direction :column}}
      (let [r 400]
           [:svg {:width r
                  :height r}
               [:circle {:cx (/ r 2)
                         :cy (/ r 2)
                         :r (/ r 2)
                         :fill "none"
                         :stroke-width 1
                         :stroke "white"}]])])

 ;;    [:div {:style {:flex 1}}]
 ;;     [:div {:style {:flex 1}}]
 ;;     [:div {:style {:flex 1}}]


(defn hello-world []
  [:div {:style {:position :absolute
                 :left 0
                 :top 0
                 :bottom 0
                 :right 0
                 :display :flex
                 :flex-direction :column}}
   [:div {:style {:display :flex
                  :flex 1
                  :flex-direction :row}}
    [:div {:style {:display :flex
                   :flex 1
                   :padding 80}}
         [timer]]
    [:div {:style {:display :flex
                   :flex 1
                   :padding 80}}
         [timer]]]
   [:div {:style {:display :flex
                  :height 140}}]])


(reagent/render-component [hello-world]
                          (. js/document (getElementById "app")))

(defn on-js-reload [])
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
