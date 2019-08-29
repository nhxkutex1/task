using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;

namespace task11.Models
{
    public class UserData
    {
        [JsonProperty("source")]
        public string Source { get; set; }
        [JsonProperty("data")]
        public User User { get; set; }
    }
}
