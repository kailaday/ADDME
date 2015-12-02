package com.example.kaila.addmeplus;
    import android.app.SearchManager;
    import android.content.Context;
    import android.os.Bundle;
    import android.support.v7.app.ActionBarActivity;
    import android.support.v7.app.AppCompatActivity;
    import android.support.v7.widget.SearchView;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.MenuInflater;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            // Inflate menu to add items to action bar if it is present.
            inflater.inflate(R.menu.menu_main, menu);
            // Associate searchable configuration with the SearchView
            SearchManager searchManager =
                    (SearchManager) getSystemService(Context.SEARCH_SERVICE);
            SearchView searchView =
                    (SearchView) menu.findItem(R.id.menu_search).getActionView();
            searchView.setSearchableInfo(
                    searchManager.getSearchableInfo(getComponentName()));

            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
