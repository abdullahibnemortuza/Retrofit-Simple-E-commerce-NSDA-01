A simple Android app built with **Kotlin**, **MVVM architecture**, **Retrofit**, and **Glide** that fetches product data from [FakeStoreAPI](https://fakestoreapi.com/) and displays it in a RecyclerView.

---

## ✨ Features
- Fetches product data (title, price, image) from FakeStoreAPI
- Displays products in a RecyclerView using ViewBinding
- Loads images efficiently with **Glide**
- MVVM architecture (Repository + ViewModel + UI)
- Error handling with placeholders for images

---

## 🛠 Tech Stack
- **Kotlin**
- **Android Jetpack**
  - ViewModel
  - LiveData
  - ViewBinding
- **Retrofit** → for API calls
- **Glide** → for image loading
- **RecyclerView** → for displaying products

---

## 📦 API
This project uses [FakeStoreAPI](https://fakestoreapi.com/) for product data.

Example product JSON:
```json
{
  "id": 1,
  "title": "Fjallraven Backpack",
  "price": 109.95,
  "description": "Your perfect pack for everyday use...",
  "category": "men's clothing",
  "image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg"
}
🚀 Future Improvements

Add product detail screen

Add cart functionality

Implement pagination

Add offline caching with Room DB
