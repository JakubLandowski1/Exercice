import { Button, FlatList, Pressable, StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import ModalInput from './component/ModalInput'
import Article from './component/Article'

export default function App() {
  const [modalIsVisible, setModalIsVisible] = useState(false)
  const [articles, setArticles] = useState([])

  function addArticle(article) {
    setArticles(articlesCurrent => [
      ...articlesCurrent,
      { text: article, id: Math.random().toString() }
    ])
    setModalIsVisible(false) //  closeModale()

  }

  function closeModale() {
    setModalIsVisible(false)
  }

  function openModale() {
    setModalIsVisible(true)
  }

  function suppArticle(article) {
    let tab = [...articles]
    let newTab = tab.filter((elem) => elem.id != article)
    setArticles(newTab)
  }

  return (
    <View style={styles.container}>
      <Button title='Add Article' onPress={openModale} />
      <ModalInput visible={modalIsVisible} closeModale={closeModale} addArticle={addArticle}></ModalInput>
      <FlatList data={articles} renderItem={(itemData) => {
        return (
          <Pressable onPress={()=> suppArticle(itemData.item.id)}>
            <Article item={itemData.item} ></Article>
          </Pressable>
        )
      }
      } keyExtractor={(item, index) => {
        return index // item.id
      }}
      ></FlatList>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    paddingTop: 20,
    paddingHorizontal: 16,
  }
})