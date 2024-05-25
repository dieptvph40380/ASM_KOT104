import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

import com.example.asm_kot104.ui.theme.ASM_KOT104Theme
import com.google.android.material.bottomnavigation.BottomNavigationMenuView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//                MainScreen()
        }
    }
}

sealed class Screen(val route: String, val icon: Int, val title: String) {
//    object Home : Screen("home", R.drawable.ic_home, "Home")
//    object Search : Screen("search", R.drawable.ic_search, "Search")
//    object Profile : Screen("profile", R.drawable.ic_profile, "Profile")
}

//@Composable
//fun MainScreen() {
//    val navController = rememberNavController()
//    Scaffold(
//        bottomBar = {
//
//        }
//    ) { innerPadding ->
//        NavHost(
//            navController,
//            startDestination = Screen.Home.route,
//            modifier = Modifier.padding(innerPadding)
//        ) {
//            composable(Screen.Home.route) { HomeScreen() }
//            composable(Screen.Search.route) { SearchScreen() }
//            composable(Screen.Profile.route) { ProfileScreen() }
//        }
//    }
//}



@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Home Screen", fontSize = 24.sp)
    }
}

@Composable
fun SearchScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Search Screen", fontSize = 24.sp)
    }
}

@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Profile Screen", fontSize = 24.sp)
    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ASM_KOT104Theme {
////        MainScreen()
//    }
//}
