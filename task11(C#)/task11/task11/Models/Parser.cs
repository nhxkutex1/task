using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;
using NUnit.Framework;

namespace task11.Models
{
    public class Parser
    {
        public static UserData GetParsedJsonUserData()
        {
            string json = File.ReadAllText(Path.Combine(TestContext.CurrentContext.TestDirectory,"user.json"));
            var userData = JsonConvert.DeserializeObject<UserData>(json);

            return userData;
        }
    }
}
