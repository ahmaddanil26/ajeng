package com.example.kanti





import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman = ArrayList()
        listTeman.add(
            MyFriend("Kanti", "Perempuan", "Kanti@gmail.com,"
                , "081234567890", "Malang")
        )
        listTeman.add(
            MyFriend("Ajeng", "perempuan", "ajeng@gmail.com",
                "081234567890", "malang")
        )
        listTeman.add(
            MyFriend("aces", "perempuan", "aces@gmail.com",
                "081234567890", "malang")
        )
        listTeman.add(
            MyFriend("wilujeng", "perempuan", "wilujeng@gmail.com",
                "081234567890", "malang")
        )
        listTeman.add(
            MyFriend("kwilujeng", "Laki-laki", "kwilujeng@gmail.com",
                "081234567890", "malang")
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private fun tampilTeman() {
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(requireActivity(), listTeman)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()

    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}