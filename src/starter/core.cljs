(ns starter.core
    (:require [reagent.core :as r]
              [react-sticky :as rs]))
(defn app []
  [:> rs/StickyContainer
     [:> rs/Sticky (fn [props] (r/as-element [:div {:style (js->clj (.-style props))}
                                              "STICKY"]))]
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])
     (r/as-element [:div "NOT STICKY"])])

(defn stop []
  (js/console.log "Stopping..."))

(defn start []
  (js/console.log "Starting...")
  (r/render [app]
            (.getElementById js/document "app")))

(defn ^:export init []
  (start))
