import 'package:flutter/material.dart';

void main() {
  runApp(ServiConectaApp());
}

class ServiConectaApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'ServiConecta',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primaryColor: Color(0xFF1E88E5), // Azul principal
        colorScheme: ColorScheme.light(
          primary: Color(0xFF1E88E5),
          secondary: Color(0xFF42A5F5),
          surface: Colors.white,
          background: Color(0xFFF5F7FA),
        ),
        scaffoldBackgroundColor: Colors.white,
        appBarTheme: AppBarTheme(
          backgroundColor: Color(0xFF1E88E5),
          elevation: 0,
          centerTitle: true,
          iconTheme: IconThemeData(color: Colors.white),
          titleTextStyle: TextStyle(
            color: Colors.white,
            fontSize: 20,
            fontWeight: FontWeight.bold,
          ),
        ),
        fontFamily: 'Poppins',
        elevatedButtonTheme: ElevatedButtonThemeData(
          style: ElevatedButton.styleFrom(
            backgroundColor: Color(0xFF1E88E5),
            foregroundColor: Colors.white,
            elevation: 2,
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(12),
            ),
            padding: EdgeInsets.symmetric(horizontal: 16, vertical: 12),
          ),
        ),
      ),
      home: HomePage(),
    );
  }
}

class HomePage extends StatefulWidget {
  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  int _currentIndex = 0;
  final TextEditingController _searchController = TextEditingController();

  // Categorias simuladas
  final List<Map<String, dynamic>> _categories = [
    {'icon': Icons.grass, 'name': 'Jardinagem'},
    {'icon': Icons.plumbing, 'name': 'Encanamento'},
    {'icon': Icons.format_paint, 'name': 'Pintura'},
    {'icon': Icons.electric_bolt, 'name': 'Elétrica'},
    {'icon': Icons.cleaning_services, 'name': 'Limpeza'},
    {'icon': Icons.handyman, 'name': 'Montagem'},
    {'icon': Icons.construction, 'name': 'Manutenção'},
    {'icon': Icons.home_repair_service, 'name': 'Reformas'},
  ];

  // Prestadores destacados (simulados)
  final List<Map<String, dynamic>> _featuredProviders = [
    {
      'name': 'Carlos Silva',
      'profession': 'Encanador',
      'rating': 4.8,
      'reviews': 125,
      'image': 'https://via.placeholder.com/150',
      'available': true,
    },
    {
      'name': 'Ana Oliveira',
      'profession': 'Eletricista',
      'rating': 4.9,
      'reviews': 210,
      'image': 'https://via.placeholder.com/150',
      'available': true,
    },
    {
      'name': 'Marcos Santos',
      'profession': 'Jardineiro',
      'rating': 4.7,
      'reviews': 98,
      'image': 'https://via.placeholder.com/150',
      'available': false,
    },
    {
      'name': 'Julia Costa',
      'profession': 'Pintora',
      'rating': 4.9,
      'reviews': 156,
      'image': 'https://via.placeholder.com/150',
      'available': true,
    },
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('ServiConecta'),
        actions: [
          IconButton(
            icon: Icon(Icons.notifications_outlined),
            onPressed: () {
              // Implementar ação de notificações
            },
          ),
        ],
      ),
      body: SingleChildScrollView(
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: <Widget>[
            // Barra de pesquisa
            Container(
              padding: EdgeInsets.symmetric(horizontal: 16, vertical: 8),
              color: Theme.of(context).colorScheme.primary,
              child: Container(
                decoration: BoxDecoration(
                  color: Colors.white,
                  borderRadius: BorderRadius.circular(12),
                ),
                child: TextField(
                  controller: _searchController,
                  decoration: InputDecoration(
                    hintText: 'Buscar serviços...',
                    prefixIcon: Icon(Icons.search, color: Color(0xFF1E88E5)),
                    border: InputBorder.none,
                    contentPadding: EdgeInsets.symmetric(
                      horizontal: 16,
                      vertical: 14,
                    ),
                  ),
                ),
              ),
            ),

            // Seção de promoção
            Container(
              margin: EdgeInsets.symmetric(horizontal: 16, vertical: 16),
              decoration: BoxDecoration(
                gradient: LinearGradient(
                  colors: [Color(0xFF1E88E5), Color(0xFF42A5F5)],
                  begin: Alignment.topLeft,
                  end: Alignment.bottomRight,
                ),
                borderRadius: BorderRadius.circular(16),
              ),
              child: Padding(
                padding: EdgeInsets.all(16),
                child: Row(
                  children: [
                    Expanded(
                      child: Column(
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: [
                          Text(
                            'Encontre os melhores profissionais',
                            style: TextStyle(
                              color: Colors.white,
                              fontSize: 18,
                              fontWeight: FontWeight.bold,
                            ),
                          ),
                          SizedBox(height: 8),
                          Text(
                            'Serviços com garantia e qualidade',
                            style: TextStyle(
                              color: Colors.white.withOpacity(0.9),
                              fontSize: 14,
                            ),
                          ),
                          SizedBox(height: 16),
                          ElevatedButton(
                            onPressed: () {
                              // Ação do botão
                            },
                            style: ElevatedButton.styleFrom(
                              backgroundColor: Colors.white,
                              foregroundColor: Color(0xFF1E88E5),
                            ),
                            child: Text('Solicitar agora'),
                          ),
                        ],
                      ),
                    ),
                    SizedBox(width: 16),
                    Icon(
                      Icons.home_repair_service,
                      color: Colors.white,
                      size: 60,
                    ),
                  ],
                ),
              ),
            ),

            // Categorias de serviços
            Padding(
              padding: EdgeInsets.symmetric(horizontal: 16, vertical: 8),
              child: Text(
                'Categorias',
                style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
              ),
            ),
            Container(
              height: 120,
              child: ListView.builder(
                scrollDirection: Axis.horizontal,
                padding: EdgeInsets.symmetric(horizontal: 12),
                itemCount: _categories.length,
                itemBuilder: (context, index) {
                  return CategoryCard(
                    icon: _categories[index]['icon'],
                    name: _categories[index]['name'],
                  );
                },
              ),
            ),

            // Profissionais em destaque
            Padding(
              padding: EdgeInsets.symmetric(horizontal: 16, vertical: 16),
              child: Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  Text(
                    'Profissionais em Destaque',
                    style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
                  ),
                  TextButton(
                    onPressed: () {
                      // Ver todos
                    },
                    child: Text(
                      'Ver todos',
                      style: TextStyle(color: Color(0xFF1E88E5)),
                    ),
                  ),
                ],
              ),
            ),
            ListView.builder(
              shrinkWrap: true,
              physics: NeverScrollableScrollPhysics(),
              padding: EdgeInsets.symmetric(horizontal: 16),
              itemCount: _featuredProviders.length,
              itemBuilder: (context, index) {
                return ProviderCard(provider: _featuredProviders[index]);
              },
            ),

            // Serviços recentes
            Padding(
              padding: EdgeInsets.symmetric(horizontal: 16, vertical: 16),
              child: Text(
                'Serviços Recentes na sua Região',
                style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
              ),
            ),
            Container(
              height: 180,
              child: ListView.builder(
                scrollDirection: Axis.horizontal,
                padding: EdgeInsets.symmetric(horizontal: 12),
                itemCount: 5, // Número de serviços recentes
                itemBuilder: (context, index) {
                  return RecentServiceCard();
                },
              ),
            ),

            SizedBox(height: 20),
          ],
        ),
      ),
      bottomNavigationBar: BottomNavigationBar(
        currentIndex: _currentIndex,
        onTap: (index) {
          setState(() {
            _currentIndex = index;
          });
        },
        type: BottomNavigationBarType.fixed,
        selectedItemColor: Color(0xFF1E88E5),
        unselectedItemColor: Colors.grey,
        items: [
          BottomNavigationBarItem(icon: Icon(Icons.home), label: 'Início'),
          BottomNavigationBarItem(icon: Icon(Icons.search), label: 'Explorar'),
          BottomNavigationBarItem(
            icon: Icon(Icons.assignment),
            label: 'Serviços',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.chat_bubble_outline),
            label: 'Mensagens',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.person_outline),
            label: 'Perfil',
          ),
        ],
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          // Implementar ação para solicitar novo serviço
        },
        backgroundColor: Color(0xFF1E88E5),
        child: Icon(Icons.add, color: Colors.white),
        tooltip: 'Solicitar Serviço',
      ),
    );
  }
}

// Widget para categoria
class CategoryCard extends StatelessWidget {
  final IconData icon;
  final String name;

  const CategoryCard({Key? key, required this.icon, required this.name})
    : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: EdgeInsets.symmetric(horizontal: 4),
      child: InkWell(
        onTap: () {
          // Implementar ação ao clicar na categoria
        },
        borderRadius: BorderRadius.circular(12),
        child: Container(
          width: 100,
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Container(
                padding: EdgeInsets.all(12),
                decoration: BoxDecoration(
                  color: Color(0xFFE3F2FD),
                  borderRadius: BorderRadius.circular(12),
                ),
                child: Icon(icon, size: 30, color: Color(0xFF1E88E5)),
              ),
              SizedBox(height: 8),
              Text(
                name,
                textAlign: TextAlign.center,
                style: TextStyle(fontSize: 12, fontWeight: FontWeight.w500),
              ),
            ],
          ),
        ),
      ),
    );
  }
}

// Widget para cartão de prestador
class ProviderCard extends StatelessWidget {
  final Map<String, dynamic> provider;

  const ProviderCard({Key? key, required this.provider}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Card(
      margin: EdgeInsets.only(bottom: 12),
      elevation: 2,
      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
      child: InkWell(
        onTap: () {
          // Implementar ação ao clicar no prestador
        },
        borderRadius: BorderRadius.circular(12),
        child: Padding(
          padding: EdgeInsets.all(12),
          child: Row(
            children: [
              CircleAvatar(
                radius: 30,
                backgroundColor: Colors.grey.shade300,
                child: Icon(Icons.person, size: 30, color: Colors.white),
              ),
              SizedBox(width: 16),
              Expanded(
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Row(
                      children: [
                        Text(
                          provider['name'],
                          style: TextStyle(
                            fontWeight: FontWeight.bold,
                            fontSize: 16,
                          ),
                        ),
                        SizedBox(width: 8),
                        Container(
                          padding: EdgeInsets.symmetric(
                            horizontal: 8,
                            vertical: 2,
                          ),
                          decoration: BoxDecoration(
                            color:
                                provider['available']
                                    ? Colors.green.shade100
                                    : Colors.grey.shade200,
                            borderRadius: BorderRadius.circular(10),
                          ),
                          child: Text(
                            provider['available'] ? 'Disponível' : 'Ocupado',
                            style: TextStyle(
                              fontSize: 10,
                              color:
                                  provider['available']
                                      ? Colors.green.shade700
                                      : Colors.grey.shade700,
                              fontWeight: FontWeight.w500,
                            ),
                          ),
                        ),
                      ],
                    ),
                    SizedBox(height: 4),
                    Text(
                      provider['profession'],
                      style: TextStyle(color: Colors.grey.shade700),
                    ),
                    SizedBox(height: 8),
                    Row(
                      children: [
                        Icon(Icons.star, size: 16, color: Colors.amber),
                        SizedBox(width: 4),
                        Text(
                          '${provider['rating']} (${provider['reviews']} avaliações)',
                          style: TextStyle(fontSize: 12),
                        ),
                      ],
                    ),
                  ],
                ),
              ),
              Column(
                children: [
                  IconButton(
                    onPressed: () {
                      // Implementar ação de contato
                    },
                    icon: Icon(
                      Icons.chat_bubble_outline,
                      color: Color(0xFF1E88E5),
                    ),
                  ),
                  Text(
                    'Contatar',
                    style: TextStyle(fontSize: 12, color: Color(0xFF1E88E5)),
                  ),
                ],
              ),
            ],
          ),
        ),
      ),
    );
  }
}

// Widget para cartão de serviço recente
class RecentServiceCard extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Container(
      width: 200,
      margin: EdgeInsets.symmetric(horizontal: 4),
      decoration: BoxDecoration(
        border: Border.all(color: Colors.grey.shade200),
        borderRadius: BorderRadius.circular(12),
      ),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Container(
            height: 100,
            decoration: BoxDecoration(
              color: Color(0xFFE3F2FD),
              borderRadius: BorderRadius.vertical(top: Radius.circular(12)),
            ),
            child: Center(
              child: Icon(
                Icons.home_repair_service,
                size: 40,
                color: Color(0xFF1E88E5),
              ),
            ),
          ),
          Padding(
            padding: EdgeInsets.all(8),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text(
                  'Reparo elétrico',
                  style: TextStyle(fontWeight: FontWeight.bold),
                ),
                SizedBox(height: 4),
                Text(
                  'Vila Mariana',
                  style: TextStyle(fontSize: 12, color: Colors.grey.shade700),
                ),
                SizedBox(height: 4),
                Row(
                  children: [
                    Icon(Icons.access_time, size: 12, color: Colors.grey),
                    SizedBox(width: 4),
                    Text(
                      'Hoje, 14:30',
                      style: TextStyle(fontSize: 10, color: Colors.grey),
                    ),
                  ],
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
