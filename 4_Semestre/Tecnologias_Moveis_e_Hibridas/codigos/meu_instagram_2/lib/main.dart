import 'package:flutter/material.dart';

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Instagram",
      debugShowCheckedModeBanner: false,
      home: HomePage(),
    );
  }
}

class HomePage extends StatelessWidget {
  final List<Map<String, String>> posts = [
    {
      'image': 'assets/lands_01.jpg',
      'desc':
          'QUE SHOW DA XUXA É ESSE?????????????????????????????????????????',
    },
    {'image': 'assets/lands_02.jpg', 'desc': 'Que coisa absurda!'},
    {'image': 'assets/lands_03.jpg', 'desc': 'NANI?'},
    {'image': 'assets/lands_04.jpg', 'desc': 'Cuidado o tubarão vai te pegar'},
  ];

  final String profileimage =
      'https://em-content.zobj.net/source/apple/391/smiling-face-with-sunglasses_1f60e.png';

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Instagram')),
      body: ListView.builder(
        itemCount: posts.length,
        itemBuilder: (context, index) {
          return PostCard(
            imagePath: posts[index]['image'],
            desc: posts[index]['desc'],
            profileImageurl: profileimage,
          );
        },
      ),
    );
  }
}

class PostCard extends StatefulWidget {
  final String imagePath;
  final String desc;
  final String profileImageurl;

  const PostCard({
    required this.imagePath,
    required this.desc,
    required this.profileImageurl,
  });

  @override
  State<StatefulWidget> createState() => _PostCardState();
}

class _PostCardState extends State<PostCard> {
  bool isLiked = false;
  int likeCount = 0;
  List<String> comments = [];
  final TextEditingController _commentController = TextEditingController()

  void _openCommentsBottomSheet(){
    showModalBottomSheet(
      context: context, 
      isScrollControlled: true, 
      builder: (BuildContext context){

      },
    );
  }


  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: MediaQuery.of(context).viewInsets,
      child: ListView(
        shrinkWrap: true,
        children: [
          ...comments.map((comment) => ListTile(
            leading: Icon(Icons.comment),
            title: Text(comment),
          )
        ),
        Padding(
          padding: const EdgeInsets.all(8.0),
          child: TextField(
            controller: _commentController,
            decoration: InputDecoration(
              hintText: 'Digite seu comentário',
              suffixIcon: IconButton(
                icon: Icon(Icons.send),
                onPressed: (){
                  if(_commentController.text.isNotEmpty){
                    setState(() {
                      comments.add(_commentController.text);
                    });
                    _commentController.clear();
                    Navigator.pop(context);
                    _openCommentsBottomSheet();
                  }
                },  
              )
            ),
          ),
          )
        ],
      ),
    );
  }
}
