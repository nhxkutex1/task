using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;
using task11.Models;

namespace task11.Test
{
    [TestFixture]
    public class TestUserData
    {
        private const string RegexForValidEmail = "^\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        private const string RegexForValidPhoneNumber = "^[0-9]{1}-[0-9]{3}-[0-9]{3}-[0-9]{4}";
        private const string RegexForValidId = "^[0-9]{7}";

        [Test]
        public void VerifyUserDataValidity()
        {
            var user = Parser.GetParsedJsonUserData();

            Assert.That(user.User.EmailAddress, Does.Match(RegexForValidEmail),"Email format is not valid!");
            Assert.That(user.User.PhoneNumber, Does.Match(RegexForValidPhoneNumber), "Phone Number format is not valid!");
            Assert.That(user.User.ID, Does.Match(RegexForValidId), "User ID format is not valid!");
        }
    }
}
