
using NUnit.Framework;

namespace _NetHw
{
    [TestFixture]
    public class Tests:BasePage
    { 
    HomePage home;
      [OneTimeSetUp]
  public void SetUp() {
        Initialize();
  }

  [Test,Order(1)]
public void test() {
   home = new HomePage(driver); 
   home.login();
  }
    }
}