(ns blog.views
  (:require [re-frame.core :as re-frame]
            [reagent.core :as r]))

(defn navbar []
  [:nav {:class "navbar navbar-inverse"}
   [:div {:class "container-fluid"}
    [:div {:class "navbar-header"}
     [:text {:class "navbar-brand"} "RATEDRWORLD"]]
    [:div
     [:ul {:class "nav navbar-nav"}
      [:li {:class "active"}
       [:a {:href "#" :on-click #(re-frame/dispatch [:page "home"])} "HOME"]]]]]])

(defn home []
  [:div {:class "flex-css"}
   [:div {:class "card" :on-click #(re-frame/dispatch [:page "first"])}
    [:text {:class "text-css"}  "Why Blogging????"]]
   [:div {:class "card" :on-click #(re-frame/dispatch [:page "second"])}
      [:text {:class "text-css"} "React Native"]]
   #_[:div {:class "card"}
      [:text {:class "text-css"} "My first blog article"]]
   #_[:div {:class "card"}
      [:text {:class "text-css"} "My first blog article"]]
   #_[:div {:class "card"}
      [:text {:class "text-css"} "My first blog article"]]
   #_[:div {:class "card"}
      [:text {:class "text-css"} "My first blog article"]]
   #_[:div {:class "card"}
      [:text {:class "text-css"} "My first blog article"]]
   #_[:div {:class "card"}
      [:text {:class "text-css"} "My first blog article"]]])

(defn why-blog []
  [:div {:style {:margin 12}}
   [:h2 "Why Blogging ???"]
   [:p "So the question is why do I need to blog while my life was going fine and suddenly why did I stop posting status on WhatsApp??"]
   [:p "So this blog will be a way of communication and I will be putting majority of my life events like what I am currently learning and answering few mysteries which are part of my life."]
   [:h3 "Purpose of Blog"]
   [:p "So when I had put that this is my last status, I got the same question from many people asking me-"]
   [:h6 "WHAT HAPPENED MAN??"]
   [:p "And the most common prediction was BLUE WHALE !!!!!"]
   [:img {:src "http://www.newsleakcentre.com/wp-content/uploads/2017/09/avi-5-800x445.jpg"
          :height "200"
          :width "100%"
          :style {:margin-bottom 10}}]
   [:p "And I said NO"]
   [:p "Many people threatened me for not playing the game but then i cant play until I am chosen for it."]
   [:p "So I thought my first topic should be on BLUE WHALE GAME but then I am not starting with it because I need to do more research  a bit about blue whale challenge"]
   [:p "So my app launch is over and next release will be on Thursday, so till then you will get one more article on react native"]
   [:p "So tune in for the next article, till then KEEP LEARNING"]])

(defn react-native []
  [:div {:style {:margin 12}}
   [:h2 "React Native"]
   [:div [:img {:src "https://moduscreate.com/wp-content/uploads/2015/07/ReactNativelogo-620x350.png"
                :height "200"
                :width "100%"
                :style {:margin-bottom 10}}]
    [:P "Copyright lies with Facebook"]
    [:p "So the question is why did I write copyright statement?"]
    [:p "The answer is simple, previous week I got threatened from people who said they will report to github that my project is copied and should be closed."]]
   [:p "So moving ahead to our topic, REACT NATIVE"]
   [:h3 "REACT NATIVE"]
   [:p "So this will be an article, where I will be pointing out my experience with react native (rn) domain. The question that should hit in your mind is why the name \"react native\"?"]
   [:p "React is the technology introduced by facebook to optimize the rendering of a webpage. Building native applications with the help of react is what we call react native."]
   [:h4 "How did I start working in react native?"]
   [:p "I am a developer at mindseed and we at mindseed have an application made on this domain. This application was build from scratch and I was lucky to be a part of the team."]
   [:a {:href "https://play.google.com/store/apps/details?id=in.mindseed.immerz.v2"} "Link to our Mindseed Immerz app"]
   [:P "Copyright lies with Mindseed and its not a promotion"]
   [:p "So the starting days were tough because the domain was completely new for us and we had to play around it and learn."]
   [:p "Many people threatened me for not playing the game but then i cant play until I am chosen for it."]
   [:p "So I thought my first topic should be on BLUE WHALE GAME but then I am not starting with it because I need to do more research  a bit about blue whale challenge"]
   [:p "So my app launch is over and next release will be on Thursday, so till then you will get one more article on react native"]
   [:p "So tune in for the next article, till then KEEP LEARNING"]])

(defn page [name]
  (condp = name
    "home" #'home
    "first" #'why-blog
    "second" #'react-native))

(defn main-panel []
  (let [name (re-frame/subscribe [:page])]
    (fn []
      [:div
       [navbar]
       [(page @name)]])))
