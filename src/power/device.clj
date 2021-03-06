(ns
  ^{:doc    "Device namespace that contains common protocols and functions"
    :author "Santiago de Pedro"
    :added  "1.0"}
  power.device)


(defprotocol Device
  "Device protocol with common device functions"
  ^{:author "Santiago de Pedro"
    :added  "1.0"}
  (close [this])
  (transmit [this command]))
