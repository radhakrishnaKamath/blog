(ns blog.events
  (:require [re-frame.core :as re-frame]
            [blog.db :as db]))

(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))

(re-frame/reg-event-db
 :page
 (fn [db [_ page]]
   (assoc db :page page)))
