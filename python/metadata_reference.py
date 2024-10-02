import uuid

class UniqueEntity():
  def __init__(self):
    super().__init__()

    self.uuid = uuid.uuid4()

class AddressLine(UniqueEntity):
  def __init__(self, address):
    super().__init__()

    self.address = address

class Organization(UniqueEntity):
  def __init__(self, name, addressLines):
    super().__init__()

    self.name = name
    self.addressLines = addressLines

class Concept():
  def __init__(self, code, system, description):
    super().__init__()

    self.code = code
    self.system = system
    self.description = description

class UniqueConcept(Concept):
  def __init__(self, code, system, description):
    super().__init__(code, system, description)

    self.uuid = uuid.uuid4()

class ConfidentialityClassification(UniqueConcept):
  def __init__(self, code, system, description, enabled):
    super().__init__(code, system, description)

    self.enabled = enabled

  @staticmethod
  def defaultSystem():
    return "https://dataandtrustalliance.org/DPS/CodeSystem/Regulations"

  @staticmethod
  def PI():
    return ConfidentialityClassification("pi", ConfidentialityClassification.defaultSystem(), "Personal Information (PI)/Demographic", False)

  @staticmethod
  def PCI():
    return ConfidentialityClassification("pci", ConfidentialityClassification.defaultSystem(), "Payment Card Industry (PCI)", False)

  @staticmethod
  def PFI():
    return ConfidentialityClassification("pfi", ConfidentialityClassification.defaultSystem(), "Personal Financial Information (PFI)", False)

  @staticmethod
  def PII():
    return ConfidentialityClassification("pii", ConfidentialityClassification.defaultSystem(), "Personally Identifiable Information (PII)", False)

  @staticmethod
  def PHI():
    return ConfidentialityClassification("phi", ConfidentialityClassification.defaultSystem(), "Personal Health Information (PHI)", False)

  @staticmethod
  def SPI():
    return ConfidentialityClassification("spi", ConfidentialityClassification.defaultSystem(), "Sensitive Personal Information (SPI)", False)

class DataFormat(UniqueEntity):
  def __init__(self, value):
    super().__init__()

    self.value = value

  @staticmethod
  def JSON():
    return DataFormat("application/json")

  @staticmethod
  def JSONLD():
    return DataFormat("application/jsonld")

  @staticmethod
  def ZIP():
    return DataFormat("application/zip")

  @staticmethod
  def MSWORD():
    return DataFormat("application/msword")

  @staticmethod
  def EXCEL():
    return DataFormat("application/vnd.ms-excel")

  @staticmethod
  def BMP():
    return DataFormat("image/bmp")

  @staticmethod
  def JPEG():
    return DataFormat("image/jpeg")

  @staticmethod
  def XPNG():
    return DataFormat("image/x-png")

  @staticmethod
  def PNG():
    return DataFormat("image/png")

  @staticmethod
  def GIF():
    return DataFormat("image/gif")

  @staticmethod
  def CSV():
    return DataFormat("text/csv")

  @staticmethod
  def TEXT():
    return DataFormat("text/plain")

class IntendedDataUse(UniqueConcept):
  def __init__(self, code, system, description, enabled):
    super().__init__(code, system, description)

    self.enabled = enabled

  @staticmethod
  def defaultSystem():
    return "https://dataandtrustalliance.org/DPS/CodeSystem/Use"

  @staticmethod
  def NON_AI_STAGING():
    return IntendedDataUse("non-ai-staging", IntendedDataUse.defaultSystem(), "Non-AI Staging/testing", False)

  @staticmethod
  def NON_AI_PRODUCTION():
    return IntendedDataUse("non-ai-production", IntendedDataUse.defaultSystem(), "Non-AI Production", False)

  @staticmethod
  def NON_AI_QUALITY():
    return IntendedDataUse("non-ai-quality", IntendedDataUse.defaultSystem(), "Non-AI Quality assurance", False)

  @staticmethod
  def AI_PRE_TRAINING():
    return IntendedDataUse("ai-pre-training", IntendedDataUse.defaultSystem(), "AI Pre-Training", False)

  @staticmethod
  def AI_ALIGNMENT():
    return IntendedDataUse("ai-alignment", IntendedDataUse.defaultSystem(), "AI Alignment", False)

  @staticmethod
  def AI_EVALUATION():
    return IntendedDataUse("ai-evaluation", IntendedDataUse.defaultSystem(), "AI Evaluation", False)

  @staticmethod
  def AI_SYNTHETIC():
    return IntendedDataUse("ai-synthetic", IntendedDataUse.defaultSystem(), "AI Synthetic Data Generation", False)

class Location():
  def __init__(self, country, state, inclusion):
    super().__init__()

    self.uuid = uuid.uuid4()
    self.country = country
    self.state = state
    self.inclusion = inclusion

class Method(UniqueConcept):
  def __init__(self, code, system, description):
    super().__init__(code, system, description)

  @staticmethod
  def defaultSystem():
    return "https://dataandtrustalliance.org/DPS/CodeSystem/Method"

  @staticmethod
  def WEB_SCRAPING_CRAWLING_TEXTUAL():
    return Method("web-scraping-crawling-textual", Method.defaultSystem(), "Web scraping/Crawling Textual")

  @staticmethod
  def WEB_SCRAPING_CRAWLING_STRUCTURED():
    return Method("web-scraping-crawling-structured", Method.defaultSystem(), "Web scraping/Crawling Structured")

  @staticmethod
  def WEB_SCRAPING_CRAWLING_METADATA():
    return Method("web-scraping-crawling-metadata", Method.defaultSystem(), "Web scraping/Crawling Metadata")

  @staticmethod
  def WEB_SCRAPING_CRAWLING_SOCIAL_MEDIA():
    return Method("web-scraping-crawling-social-media", Method.defaultSystem(), "Web scraping/Crawling Social media")

  @staticmethod
  def WEB_SCRAPING_CRAWLING_NEWS_ARTICLES():
    return Method("web-scraping-crawling-news-articles", Method.defaultSystem(), "Web scraping/Crawling News & articles")

  @staticmethod
  def FEEDS_RSS_SOURCE():
    return Method("feeds-rss-source", Method.defaultSystem(), "Feeds RSS source")

  @staticmethod
  def FEEDS_API_SOURCE():
    return Method("feeds-api-source", Method.defaultSystem(), "Feeds API source")

  @staticmethod
  def FEEDS_REAL_TIME_DATABASE_INFO():
    return Method("feeds-real-time-database-info", Method.defaultSystem(), "Feeds Real time database info")

  @staticmethod
  def FEEDS_INTERVAL_TIMED_DATABASE_INFO():
    return Method("feeds-interval-timed-database-info", Method.defaultSystem(), "Feeds Interval timed database info")

  @staticmethod
  def FEEDS_FILE_FEED_INFO():
    return Method("feeds-file-feed-info", Method.defaultSystem(), "Feeds File feed info")

  @staticmethod
  def SYNDICATION_NEWS_FEEDS():
    return Method("syndication-news-feeds", Method.defaultSystem(), "Syndication News feeds")

  @staticmethod
  def SYNDICATION_FINANCIAL_FEEDS():
    return Method("syndication-financial-feeds", Method.defaultSystem(), "Syndication Financial feeds")

  @staticmethod
  def SYNDICATION_SOCIAL_MEDIA():
    return Method("syndication-social-media", Method.defaultSystem(), "Syndication Social media")

  @staticmethod
  def SYNDICATION_PRODUCT_SERVICE_CATALOG():
    return Method("syndication-product-service-catalog", Method.defaultSystem(), "Syndication Product/service catalog")

  @staticmethod
  def DATA_MINING_ASSOCIATION_RULE():
    return Method("data-mining-association-rule", Method.defaultSystem(), "Data mining Association rule")

  @staticmethod
  def DATA_MINING_CLASSIFICATION():
    return Method("data-mining-classification", Method.defaultSystem(), "Data mining Classification")

  @staticmethod
  def DATA_MINING_CLUSTERING():
    return Method("data-mining-clustering", Method.defaultSystem(), "Data mining Clustering")

  @staticmethod
  def DATA_MINING_REGRESSION():
    return Method("data-mining-regression", Method.defaultSystem(), "Data mining Regression")

  @staticmethod
  def DATA_MINING_ANOMALY_DETECTION():
    return Method("data-mining-anomaly-detection", Method.defaultSystem(), "Data mining Anomaly detection")

  @staticmethod
  def DATA_MINING_SEQUENCING():
    return Method("data-mining-sequencing", Method.defaultSystem(), "Data mining Sequencing")

  @staticmethod
  def MACHINE_GENERATED_MLOPS_SYNTHETIC():
    return Method("machine-generated-mlops-synthetic", Method.defaultSystem(), "Machine generated/MLOps Synthetic")

  @staticmethod
  def MACHINE_GENERATED_MLOPS_GENERATIVE():
    return Method("machine-generated-mlops-generative", Method.defaultSystem(), "Machine generated/MLOps Generative")

  @staticmethod
  def MACHINE_GENERATED_MLOPS_TWIN():
    return Method("machine-generated-mlops-twin", Method.defaultSystem(), "Machine generated/MLOps Twin")

  @staticmethod
  def MACHINE_GENERATED_MLOPS_MACHINE_2_MACHINE():
    return Method("machine-generated-mlops-machine-2-machine", Method.defaultSystem(), "Machine generated/MLOps Machine-2-machine (M2M)")

  @staticmethod
  def MACHINE_GENERATED_MLOPS_AI_INFERRED():
    return Method("machine-generated-mlops-ai-inferred", Method.defaultSystem(), "Machine generated/MLOps AI inferred")

  @staticmethod
  def MACHINE_GENERATED_MLOPS_XR():
    return Method("machine-generated-mlops-xr", Method.defaultSystem(), "Machine generated/MLOps XR (AR, VR, MR)")

  @staticmethod
  def SENSOR_AND_IOT_OUTPUT_ENVIRONMENTAL():
    return Method("sensor-and-iot-output-environmental", Method.defaultSystem(), "Sensor and IoT output Environmental")

  @staticmethod
  def SENSOR_AND_IOT_OUTPUT_MOTION_LOCATION():
    return Method("sensor-and-iot-output-motion-location", Method.defaultSystem(), "Sensor and IoT output Motion & location")

  @staticmethod
  def SENSOR_AND_IOT_OUTPUT_HEALTH():
    return Method("sensor-and-iot-output-health", Method.defaultSystem(), "Sensor and IoT output Health")

  @staticmethod
  def SENSOR_AND_IOT_OUTPUT_BIOMETRIC():
    return Method("sensor-and-iot-output-biometric", Method.defaultSystem(), "Sensor and IoT output Biometric")

  @staticmethod
  def SENSOR_AND_IOT_OUTPUT_ENERGY_CONSUMPTION():
    return Method("sensor-and-iot-output-energy-consumption", Method.defaultSystem(), "Sensor and IoT output Energy consumption")

  @staticmethod
  def SENSOR_AND_IOT_OUTPUT_INDUSTRIAL_SENSOR():
    return Method("sensor-and-iot-output-industrial-sensor", Method.defaultSystem(), "Sensor and IoT output Industrial sensor")

  @staticmethod
  def SENSOR_AND_IOT_OUTPUT_VEHICLE_TRANSPORTATION():
    return Method("sensor-and-iot-output-vehicle-transportation", Method.defaultSystem(), "Sensor and IoT output Vehicle & transportation")

  @staticmethod
  def SENSOR_AND_IOT_OUTPUT_SECURITY_SURVEILLANCE():
    return Method("sensor-and-iot-output-security-surveillance", Method.defaultSystem(), "Sensor and IoT output Security & surveillance")

  @staticmethod
  def SENSOR_AND_IOT_OUTPUT_AGRICULTURE_ENVIRONMENT():
    return Method("sensor-and-iot-output-agriculture-environment", Method.defaultSystem(), "Sensor and IoT output Agriculture & environment")

  @staticmethod
  def SOCIAL_MEDIA_TEXT_BASED():
    return Method("social-media-text-based", Method.defaultSystem(), "Social media Text based")

  @staticmethod
  def SOCIAL_MEDIA_MULTIMEDIA():
    return Method("social-media-multimedia", Method.defaultSystem(), "Social media Multimedia")

  @staticmethod
  def SOCIAL_MEDIA_REVIEWS_AND_RATINGS():
    return Method("social-media-reviews-and-ratings", Method.defaultSystem(), "Social media Reviews and ratings")

  @staticmethod
  def SOCIAL_MEDIA_UPDATES():
    return Method("social-media-updates", Method.defaultSystem(), "Social media Updates")

  @staticmethod
  def SOCIAL_MEDIA_Q_AND_A():
    return Method("social-media-q-and-a", Method.defaultSystem(), "Social media Q&As")

  @staticmethod
  def SOCIAL_MEDIA_COLLABORATIVE():
    return Method("social-media-collaborative", Method.defaultSystem(), "Social media Collaborative")

  @staticmethod
  def SOCIAL_MEDIA_MEDIA_CREATIVE():
    return Method("social-media-creative", Method.defaultSystem(), "Social media Creative")

  @staticmethod
  def USER_GENERATED_CONTENT_CLICKSTREAM():
    return Method("user-generated-content-clickstream", Method.defaultSystem(), "User generated content Clickstream")

  @staticmethod
  def USER_GENERATED_CONTENT_SOCIAL_MEDIA():
    return Method("user-generated-content-social-media", Method.defaultSystem(), "User generated content Social media")

  @staticmethod
  def USER_GENERATED_CONTENT_BEHAVIOR():
    return Method("user-generated-content-behavior", Method.defaultSystem(), "User generated content Behavior")

  @staticmethod
  def USER_GENERATED_CONTENT_RATINGS_AND_REVIEWS():
    return Method("user-generated-content-ratings-and-reviews", Method.defaultSystem(), "User generated content Ratings & reviews")

  @staticmethod
  def USER_GENERATED_CONTENT_MULTIMEDIA():
    return Method("user-generated-content-multimedia", Method.defaultSystem(), "User generated content Multimedia")

  @staticmethod
  def PRIMARY_USER_SOURCE_SURVEY_QUESTIONNAIRE():
    return Method("primary-user-source-survey-questionnaire", Method.defaultSystem(), "Primary user source Survey/Questionnaire")

  @staticmethod
  def PRIMARY_USER_SOURCE_INTERVIEW():
    return Method("primary-user-source-interview", Method.defaultSystem(), "Primary user source Interview")

  @staticmethod
  def PRIMARY_USER_SOURCE_EVENT():
    return Method("primary-user-source-event", Method.defaultSystem(), "Primary user source Event")

  @staticmethod
  def PRIMARY_USER_SOURCE_BIOMETRIC():
    return Method("primary-user-source-biometric", Method.defaultSystem(), "Primary user source Biometric")

  @staticmethod
  def PRIMARY_USER_SOURCE_FOCUS_GROUP():
    return Method("primary-user-source-focus-group", Method.defaultSystem(), "Primary user source Focus Group")

  @staticmethod
  def DATA_AUGMENTATION():
    return Method("data-augmentation-na", Method.defaultSystem(), "Data augmentation N/A")

  @staticmethod
  def TRANSFER_LEARNING():
    return Method("transfer-learning-na", Method.defaultSystem(), "Transfer learning N/A")

  @staticmethod
  def SIMULATIONS():
    return Method("simulations-na", Method.defaultSystem(), "Simulations N/A")

  @staticmethod 
  def OTHER():
    return Method("other-na", Method.defaultSystem(), "Other N/A")

class PrivacyEnhancingTechnology():
  def __init__(self, tool, parameters, result):
    super().__init__()

    self.uuid = uuid.uuid4()
    self.tool = tool
    self.parameters = parameters
    self.result = result

  @staticmethod
  def defaultSystem():
    return "https://dataandtrustalliance.org/DPS/CodeSystem/PET"
