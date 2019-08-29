using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;

namespace task11.Models
{
    public class User
    {
        [JsonProperty("unid")]
        public string ID { get; set; }
        [JsonProperty("firstName")]
        public string FirstName { get; set; }
        [JsonProperty("lastName")]
        public string LastName { get; set; }
        [JsonProperty("emailAddress")]
        public string EmailAddress { get; set; }
        [JsonProperty("phoneNumber")]
        public string PhoneNumber { get; set; }
        [JsonProperty("countryCode")]
        public string CountryCode { get; set; }
        [JsonProperty("consentForDetails")]
        public bool ConsentForDetails { get; set; }
        [JsonProperty("marketingConsent")]
        public bool MarketingConsent { get; set; }

    }
}
