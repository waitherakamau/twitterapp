package dev.effence.twitterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.effence.twitterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweet()
    }
    fun displayTweet(){
        var twitter1=Tweet("Effence Kamau","@sech","#plumbing,farming i love animals and plants","54678734","4500","34567890","","","","")
        var twitter2=Tweet("Akuot Philip","@Dinskey","#Jamanjuice code every coder was once a beginner","54678734","4500","34567890","","","","")
        var twitter3=Tweet("Grace Waceke","@AfricanQueen","#Cloud engineer killing two birds with one stone","54678734","4500","34567890","","","","")
        var twitter4=Tweet("Joyce Nkimalantoi","Prettymasai","#0 knowledge in tech but hosting and deploying","54678734","4500","34567890","","","","")
        var twitter5=Tweet("Quenter Odoyo","@jaber","#code sleep repeat and take coffee","54678734","4500","34567890","","","","")
        var twitter6=Tweet("Phelisia Jeruto","@PJ","#with God all things are possible code and win it","54678734","4500","34567890","","","","")
        var twitter7=Tweet("Salma Suleiman","@safeisoul","#be an adjective not a noun","54678734","4500","34567890","","","","")
        var twitter8=Tweet("Rose Mwihaki","@kaki","#relax watch movies sleep take care of yourself code","54678734","4500","34567890","","","","")
        var twitter9=Tweet("Quenzy Ongeye","@AndroidQueen","#i went sleepless nights when i was a beginner but watch me im a debugger","54678734","4500","34567890","","","","")
        var twitter10=Tweet("Winfred Waiguru","@Partylife","#make up dress well party monday go back to code live work party","54678734","4500","34567890","","","","")
        var twitter11=Tweet("Cudra Moha","@Allah vibes","#black hoodie cyberSecurity fulfill bucket list","54678734","4500","34567890","","","","")
        var twitterList= listOf(twitter1,twitter2,twitter3,twitter4,twitter5,twitter6,twitter7,twitter8,twitter9,twitter10,twitter11)
        var twitterAdapter=TwitterRVAdapter(twitterList)
        binding.rvTwitter.layoutManager=LinearLayoutManager(this)
        binding.rvTwitter.adapter=twitterAdapter

    }
}